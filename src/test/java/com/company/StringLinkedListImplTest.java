package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringLinkedListImplTest {

    private static StringLinkedListImpl subject;
    private String str1 = "aaa";
    private String str2 = "bbb";
    private String str3 = "ccc";
    private int size = 3;
    private static String strToFirst = "ddd";
    private static String strToLast = "zzz";
    private static String strToIndex = "nnn";


    @BeforeEach
     public void setSubject(){
        subject = new StringLinkedListImpl();
        //заполняем данными нашего метода
        subject.add(str1, 0);
        subject.add(str2, 1);
        subject.add(str3, 2);
     }

    @Test
    public void shouldAddFirstToEmptyList(){
        // создаем пустой список
        subject = new StringLinkedListImpl();
        subject.addFirst(strToFirst);
        Assertions.assertEquals(strToFirst, subject.getFirst());
    }

    @Test
    public void shouldAddFirstToNotEmptyList(){
        subject.addFirst(strToFirst);
        Assertions.assertEquals(strToFirst, subject.getFirst());
    }

    @Test
    public void shouldAddToFirst(){
        subject.add(strToFirst, 0);
        Assertions.assertEquals(strToFirst, subject.getFirst());
    }

    @Test
    public void shouldAddToLast(){
        subject.addLast(strToLast);
        Assertions.assertEquals(strToLast, subject.getLast());
    }

    @Test
    public void shouldAddForIndex(){
        subject.add(strToIndex, 2);
        Assertions.assertEquals(strToIndex, subject.get(2));
    }

   @Test
    public void shouldGetFirst(){
        String actual = subject.getFirst();
        Assertions.assertEquals(str1, actual);
    }

    @Test
    public void shouldGetLast(){
        String actual = subject.getLast();
        Assertions.assertEquals(str3, actual);
    }

    @Test
    public void shouldRemoveFirst(){
        String actual = subject.removeFirst();
        Assertions.assertEquals(str1, actual);
    }
    @Test
    public void shouldRemoveOnIndex(){
        String actual = subject.remove(1);
        Assertions.assertEquals(str2, actual);
    }

    @Test
    public void shouldRemoveLast(){
        String actual = subject.removeLast();
        Assertions.assertEquals(str3, actual);
    }

    @Test
    public void shouldSize(){
        int actual = subject.size();
        Assertions.assertEquals(size, actual);
    }

}
