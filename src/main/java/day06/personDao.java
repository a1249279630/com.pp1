package day06;

import java.io.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class personDao {
    public static  void  Insert() throws Exception {
        dbUtil dbUtil=new dbUtil();
        Connection connection=dbUtil.con();
        Statement statement=connection.createStatement();
        String sql="INSERT INTO t_person VALUES(null,'小明',12,'男',1,1);";
        statement.execute(sql);
        statement.close();
        dbUtil.closeCon(connection);
    }
    public static void Delete() throws Exception {
        dbUtil dbUtil=new dbUtil();
        Connection connection=dbUtil.con();
        Statement statement=connection.createStatement();
        String sql="DELETE  FROM t_person WHERE name='小明'";
        statement.execute(sql);
        statement.close();
        dbUtil.closeCon(connection);
    }
    public static void Update() throws Exception {
        dbUtil dbUtil=new dbUtil();
        Connection connection=dbUtil.con();
        Statement statement=connection.createStatement();
        String sql="UPDATE t_person SET name='小明' WHERE id=1;";
        statement.execute(sql);
        statement.close();
        dbUtil.closeCon(connection);
    }
    public static <list> void Find() throws Exception {
        dbUtil dbUtil=new dbUtil();
        Connection connection=dbUtil.con();
        Statement statement=connection.createStatement();
        String sql="SELECT * FROM t_person WHERE name='小明';";
        ResultSet resultSet=statement.executeQuery(sql);
        List<Person> personList=new ArrayList<Person>();
        while(resultSet.next()){
            Person person=new Person();
            int id=resultSet.getInt("id");
            String name=resultSet.getString("name");
            int age=resultSet.getInt("age");
            String gender=resultSet.getString("gender");
            int petId=resultSet.getInt("petId");
            int goodId=resultSet.getInt("goodId");
            person.setId(id);
            person.setAge(age);
            person.setGender(gender);
            person.setName(name);
            person.setGoodId(goodId);
            person.setPetId(petId);
            personList.add(person);
        }

        statement.close();
        dbUtil.closeCon(connection);
        outputfile(personList);
    }
    public static void outputfile(List<Person> personList) throws IOException {
        File file=new File("F:\\tang/person.txt");
        Writer writer=new OutputStreamWriter(new FileOutputStream(file));
        System.out.println(personList.toString());
        writer.write(personList.toString());
        writer.close();

    }



    public static void main(String[] args) throws Exception {
        for(int i=0;i<10;i++){
            Insert();
        }
        Find();
    }
}
