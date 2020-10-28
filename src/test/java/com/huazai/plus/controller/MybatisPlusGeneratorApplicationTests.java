package com.huazai.plus.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisPlusGeneratorApplicationTests {

	@Test
	public void contextLoads() {
		List<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);

        List<Integer> list2=new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);

        System.out.println("====求交集===");

        List<Integer> list=list1.stream().filter(t->list2.contains(t)).collect(Collectors.toList());
        list.stream().forEach(System.out::println);


        System.out.println("====入参求差集===");
        list=list1.stream().filter(t-> !list2.contains(t)).collect(Collectors.toList());
        list.stream().forEach(System.out::println);
        
        
        System.out.println("====出参求差集===");
        list=list2.stream().filter(t -> !list1.contains(t)).collect(Collectors.toList());
        list.stream().forEach(System.out::println);


        System.out.println("====求并集===");

        list.addAll(list1);
        list.addAll(list2);
        list=list.stream().distinct().collect(Collectors.toList());
        list.stream().forEach(System.out::println);
	}

}
