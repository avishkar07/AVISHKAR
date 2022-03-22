package PhoneBook;

import java.sql.*;
import java.util.Scanner;

public class ContactInserction {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/phonebook";
        String usr = "root";
        String pass = "avishkar2001";

        Connection connection = DriverManager.getConnection(url, usr, pass);

        Statement statement = connection.createStatement();

        Scanner scanner = new Scanner(System.in);
        int key;
do {

            System.out.println("To Insert the Number press 1 :");
            System.out.println("To Update the Number press 2 :");
            System.out.println("To Delete the Number press 3 :");
            System.out.println("To Print the Numbers press 4 :");
            System.out.println("To Exit Enter Number press 0 :");

            key = scanner.nextInt();

            switch (key) {

                case 1:

                    System.out.println("Enter the CONTACT_ID : ");
                    int CONTACT_ID = scanner.nextInt();
                    System.out.println("Enter the CONTACT_Name :");
                    String CONTACT_NAME = scanner.next();
                    System.out.println("Enter the CONTACT_NO :");
                    String CONTACT_NO = scanner.next();


                    String query = "insert into phonenumbers VALUES(" + CONTACT_ID + ",'" + CONTACT_NAME + "','" + CONTACT_NO + "')";

                    int n = statement.executeUpdate(query);
                    System.out.println("Inserted Sucessfull .");
                    System.out.println("-------------------------------------------------");

                    break;

                case 2:
                    System.out.println("Enter the CONTACT_ID : ");
                    int CONTACT_ID1 = scanner.nextInt();
                    System.out.println("Enter the CONTACT_Name :");
                    String CONTACT_NAME2 = scanner.next();
                    System.out.println("Enter the CONTACT_NO :");
                    String CONTACT_NO3 = scanner.next();
                    System.out.println("Enter the which ID want change :");
                    int CHANGE_ID = scanner.nextInt();

                    String query1 = "Update phonenumbers set CONTACT_ID =" + CONTACT_ID1 + ",CONTACT_NAME ='" + CONTACT_NAME2 + "',CONATACT_NO='" + CONTACT_NO3 + "' where CONTACT_ID =" + CHANGE_ID + ";";
                    int o = statement.executeUpdate(query1);
                    System.out.println("Updated Sucessfull .");
                    System.out.println("-------------------------------------------------");

                    break;

                case 3:
                    System.out.println("Enter the which ID want Delete :");
                    int DELETED_ID = scanner.nextInt();

                    String query2 = "Delete from phonenumbers where CONTACT_ID =" + DELETED_ID + ";";
                    int p = statement.executeUpdate(query2);
                    System.out.println("Deleted Sucessfull .");
                    System.out.println("-------------------------------------------------");

                    break;

                case 4:
                    String query3 = "select * from phonenumbers ;";
                    ResultSet resultSet = statement.executeQuery(query3);

                    while (resultSet.next()) {
                        System.out.println(resultSet.getInt(1) +"   " + resultSet.getString(2) +"  "+ resultSet.getString(3));
                    }
                    System.out.println("-------------------------------------------------");
                    break;
            }
            }
            while (key!=0);

    }
}
