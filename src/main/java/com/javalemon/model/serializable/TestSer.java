package com.javalemon.model.serializable;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lemon
 * @date 2019-08-04
 * @desc
 */

public class TestSer {

    @Test
    public void testObejctListInput() throws IOException{
        ObjectInputStream inputStream = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream("/Users/lvxiran/dev/input/dog.text")
                )
        );
        try {

            Object o = inputStream.readObject();

            System.out.println(JSON.toJSONString(o));


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            inputStream.close();
        }
    }

    @Test
    public void testListOutPut() {
        try {

            List<Dog> dogs = new ArrayList<Dog>();
            Dog dog = new Dog();
            dog.name = "123";
            dogs.add(dog);
            Dog dog2 = new Dog();
            dog2.name = "234";
            dogs.add(dog2);

            ObjectOutputStream outputStream = new ObjectOutputStream(
                    new BufferedOutputStream(new FileOutputStream("/Users/lvxiran/dev/input/dog.text"))
            );

            outputStream.writeObject(dogs);

            outputStream.flush();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testInput()  throws IOException{
        ObjectInputStream inputStream = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream("/Users/lvxiran/dev/input/dog.text")
                )
        );
        try {

            int size = inputStream.readInt();
            List<Dog> dogs = new ArrayList<Dog>(size);
            for (int i = 0; i < size; i++) {
                try {
                    dogs.add((Dog) inputStream.readObject());
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }

            System.out.println(JSON.toJSONString(dogs));


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            inputStream.close();
        }
    }

    @Test
    public void testOutPut() {
        try {

            List<Dog> dogs = new ArrayList<Dog>();
            Dog dog = new Dog();
            dog.name = "123";
            dogs.add(dog);
            Dog dog2 = new Dog();
            dog2.name = "234";
            dogs.add(dog2);

            ObjectOutputStream outputStream = new ObjectOutputStream(
                    new BufferedOutputStream(new FileOutputStream("/Users/lvxiran/dev/input/dog.text"))
            );

            outputStream.writeInt(dogs.size());
            for (Dog oneDog : dogs) {
                outputStream.writeObject(oneDog);
            }

            outputStream.flush();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
