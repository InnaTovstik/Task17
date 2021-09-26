package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringLinkedListImplTest {

    private static StringLinkedListImpl subject;

    @BeforeEach
     public void setSubject(){
        subject = new StringLinkedListImpl();
        String str1 = "aaa";
        String str2 = "bbb";
        String str3 = "ccc";
        //заполняем данными нашего метода
        subject.add(str1,0);
        subject.add(str2, 1);
        subject.add(str3, 2);
    }

    @Test
    public void shouldAddFirstToEmptyList(){
        String str = "ddd";
        // создаем пустой список
        subject = new StringLinkedListImpl();
        subject.addFirst(str);
        Assertions.assertEquals("ddd", subject.getFirst());
    }

    @Test
    public void shouldAddFirstToNotEmptyList(){
        String str = "ddd";
        subject.addFirst(str);
        Assertions.assertEquals("ddd", subject.getFirst());
    }

    @Test
    public void shouldAddToFirst(){
        String str = "ddd";
        subject.add(str, 0);
        Assertions.assertEquals("ddd", subject.getFirst());
    }

    @Test
    public void shouldAddToLast(){
        String str = "ddd";
        subject.addLast(str);
        Assertions.assertEquals("ddd", subject.getLast());
    }

    @Test
    public void shouldAddForIndex(){
        String str = "yyy";
        subject.add(str, 2);
        Assertions.assertEquals("yyy", subject.get(2));
    }

    @Test
    public void shouldAddLast(){
        String str = "zzz";
        subject.addLast(str);
        Assertions.assertEquals("zzz", subject.getLast());
    }

    @Test
    public void shouldGetFirst(){
        String actual = subject.getFirst();
        Assertions.assertEquals("aaa", actual);
    }

    @Test
    public void shouldGetLast(){
        String actual = subject.getLast();
        Assertions.assertEquals("ccc", actual);
    }

    @Test
    public void shouldRemoveFirst(){
        String actual = subject.removeFirst();
        Assertions.assertEquals("aaa", actual);
    }
    @Test
    public void shouldRemoveOnIndex(){
        String actual = subject.remove(1);
        Assertions.assertEquals("bbb", actual);
    }

    @Test
    public void shouldRemoveLast(){
        String actual = subject.removeLast();
        Assertions.assertEquals("ccc", actual);
    }

    @Test
    public void shouldSize(){
        int actual = subject.size();
        Assertions.assertEquals(3, actual);
    }

}
