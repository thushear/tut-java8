package org.thushear.tut.questions;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {

    //累加 Reduce
    public int addUp(Stream<Integer> numbers){
        return numbers.reduce(0,(acc,element)-> acc + element);
    }

    public static int countBandMembersInternal(List<Artist> artists){
        return artists.stream().map(artist -> artist.getMembers().count()).reduce(0l,Long::sum).intValue();
    }


    public static int countLowercaseLetters(String str){

       return (int) str.chars().filter(Character::isLowerCase).count();

    }


    public static void printStatics(){

    }


    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,5,6);
        int result = new StreamTest().addUp(stream);
        System.out.println("result = " + result);

        List<Artist> list = new ArrayList<Artist>();
        list.add(SampleData.theBeatles);
        int num = countBandMembersInternal(list);
        System.out.println("num = " + num);

        System.out.println("countLowercaseLetters(\"abcdABCD\") = " + countLowercaseLetters("abcdABCD"));
    }
} 
