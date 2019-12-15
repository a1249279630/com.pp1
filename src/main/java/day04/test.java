package day04;


import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class test {

    public static void main(String[] args) throws IOException {
        event();

    }

    public static void event() throws IOException {
        person person =new person();

        List<dog> list=new ArrayList<dog>();
        person.setAge(50);
        person.setName("小明");
        person.setHight(45);
        person.setSex("男");

        for (int i=0;i<10;i++){
            dog dog=new dog();
            dog.setName("dog"+i);
            dog.setCall("汪汪");
            dog.setAge(3);
            dog.setColor("黑色");
            dog.setBite(true);
            list.add(dog);
        }
        inputoutputfile(person,list);
    }
    public static void inputoutputfile(person person,List<dog> list) throws IOException {
        Date date=new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH时mm分ss秒");

        String hehe = dateFormat.format( date );
        String address ="F:\\tang/"+hehe+".txt";


        File file=new File(address);
        int random =(int) (Math.random()*10);
        Writer writer=new OutputStreamWriter(new FileOutputStream(file));
        writer.write(hehe+person.getName()+"养了一条"+list.get(random));
        writer.close();


        Reader reader=new InputStreamReader(new FileInputStream(file));
        char[] b=new char[100];
        int lem=reader.read(b);
        System.out.println(new String(b,0,lem));
        reader.close();
    }


}





