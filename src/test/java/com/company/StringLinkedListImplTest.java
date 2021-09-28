package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringLinkedListImplTest {

    private StringLinkedListImpl subject;
    private final String str1 = "aaa";
    private final String str2 = "bbb";
    private final String str3 = "ccc";
    private final int size = 3;
    private final String strToFirst = "ddd";
    private final String strToLast = "zzz";
    private final String strToIndex = "nnn";

    @BeforeEach
    public void setUp() {
        subject = new StringLinkedListImpl();
        subject.add(str1, 0);
        subject.add(str2, 1);
        subject.add(str3, 2);
    }

    //1. Список пустой после создания
    @Test
    public void shouldEmpty() {
        subject = new StringLinkedListImpl();
        assertEquals(0, subject.size());
    }

    //2.1 Метод addFirst добавляет в начало (список пустой)
    @Test
    public void shouldAddFirstToEmptyList() {
        subject = new StringLinkedListImpl();
        subject.addFirst(strToFirst);
        assertEquals(strToFirst, subject.getFirst());
    }

    //2.2 Метод addFirst добавляет в начало (список непустой)
    @Test
    public void shouldAddFirstToNotEmptyList() {
        subject.addFirst(strToFirst);
        assertEquals(strToFirst, subject.getFirst());
    }

    //3.1 Метод add добавляет по указанному индексу (в начало)
    @Test
    public void shouldAddToFirst() {
        subject.add(strToFirst, 0);
        assertEquals(strToFirst, subject.getFirst());
    }

    //3.2 Метод add добавляет по указанному индексу (в конец)
    @Test
    public void shouldAddToLast() {
        subject.add(strToLast, size);
        assertEquals(strToLast, subject.getLast());
    }

    //3.3 Метод add добавляет по указанному индексу
    @Test
    public void shouldAddForIndex() {
        subject.add(strToIndex, 1);
        assertEquals(strToIndex, subject.get(1));
    }

    //4. Метод addLast добавляет в конец
    @Test
    public void shouldAddLast() {
        subject.addLast(strToLast);
        assertEquals(strToLast, subject.getLast());
    }

    // Метод выбрасывает исключение IndexOutOfBoundsException
    @Test
    public void shouldIndexOutOfBoundsFromAdd() throws IndexOutOfBoundsException {
        assertThrows(IndexOutOfBoundsException.class, () -> subject.add(strToIndex, size + 1));
    }

    // Метод выбрасывает исключение IndexOutOfBoundsException
    @Test
    public void shouldIndexOutOfBoundsFromGet() throws IndexOutOfBoundsException {
        assertThrows(IndexOutOfBoundsException.class, () -> subject.get(size + 1));
    }

    //5. Метод getFirst возвращает первый элемент
    @Test
    public void shouldGetFirst() {
        String actual = subject.getFirst();
        assertEquals(str1, actual);
    }

    //6.Метод get возвращает элемент по указанному индексу
    @Test
    public void shouldGetToIndex() {
        String actual = subject.get(1);
        assertEquals(str2, actual);
    }

    //7. Метод getLast возвращает последний элемент
    @Test
    public void shouldGetLast() {
        String actual = subject.getLast();
        assertEquals(str3, actual);
    }

    //8. Метод removeFirst удаляет первый элемент
    @Test
    public void shouldRemoveFirst() {
        String actual = subject.removeFirst();
        assertEquals(str1, actual);
    }

    //9 Метод remove удаляет элемент по указанному индексу
    @Test
    public void shouldRemoveOnIndex() {
        String actual = subject.remove(1);
        assertEquals(str2, actual);
    }

    // Метод выбрасывает исключение IllegalArgumentException
    @Test
    public void shouldIllegalArgumentExceptionFromRemove() throws IllegalArgumentException {
        assertThrows(IllegalArgumentException.class, () -> subject.remove(size + 1));
    }

    //10. Метод removeLast удаляет последний элемент
    @Test
    public void shouldRemoveLast() {
        String actual = subject.removeLast();
        assertEquals(str3, actual);
    }

    //11. Метод size возвращает количество элементов в списке
    @Test
    public void shouldSize() {
        int actual = subject.size();
        assertEquals(size, actual);
    }
}