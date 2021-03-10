package com.company;

import java.sql.Connection;
import java.sql.DriverManager;

public class oracleDB_connection
{
    private static Connection conn = null;

    public static Connection createConnection()
    {

        if (conn != null)
        {
            return conn;
        } else
        {

            try
            {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                System.out.println("criaçao criada com sucesso!");
            } catch (ClassNotFoundException e)
            {
                System.out.println("Oops! Can't find class oracle.jdbc.driver.OracleDriver");
                System.exit(-1);
            }

            try
            {
                conn = DriverManager.getConnection(
                        "jdbc:oracle:thin:@localhost:1521:astro", "marketWorld_projecto2 ", "marketWorld_projecto2 ");
            } catch (Exception e)
            {
                System.out.println("Error: " + e.getMessage());
                System.exit(-2);
            }

            return conn;
        }
    }
}
