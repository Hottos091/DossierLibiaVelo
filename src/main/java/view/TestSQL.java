/*package view;

import java.util.*;
import java.sql.*;



//Pour tester, mettre la classe "FenetrePrincipale" en commentaire.
public class TestSQL {
    //public static void main(String[] args) {
        try
        {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookdb", "root", "pwMySQLie2017");

            //Créer instruction SQL avec ? pour éviter injection SQL
            String sqlInstruction = "insert into Book (isbn, title, pages) values (?,?,?)";

            //Créer le PreparedStatement à partir de cette instruction SQL
            PreparedStatement preparedStatement = connection.prepareStatement(sqlInstruction);


            //Remplacer les ? via les filtres (settors)

            preparedStatement.setString(1, "...");
            preparedStatement.setString(2, "...");
            preparedStatement.setInt(3, Integer.parseInt("..."));

            //Exécuter + récupérer le nombre de lignes modifiées

            int nbUpdatedLines = preparedStatement.executeUpdate();
        }

        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}

*/