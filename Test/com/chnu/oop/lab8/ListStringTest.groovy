package com.chnu.oop.lab8

import org.junit.Test;

class ListStringTest extends GroovyTestCase {

    ListString listString = new ListString();
    List<String> strings = new ArrayList<>();

   @Test
    void testFindPolindrom() {

       strings.add("abba");
       strings.add("abcba");
       strings.add("abdbva");
       List<String> rightResult=new ArrayList<>()
       rightResult.add("abba");
       rightResult.add("abcba")
       assertEquals(rightResult,listString.findPolindrom(strings))

    }
}
