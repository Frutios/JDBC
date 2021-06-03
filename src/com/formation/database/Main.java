package com.formation.database;

import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        FruitJdbcDAO fDao = new FruitJdbcDAO();
        List<Fruit> fruits = fDao.findAll();

        for (Fruit f: fruits) {
            System.out.println(f.getId());
            System.out.println(f.getName());
            System.out.println(f.getExpirationDate());
        }

        Fruit fruit = new Fruit("Poire", LocalDate.now());
        Fruit fruitCreated = fDao.create(fruit);

        System.out.println("Le fruit avec l'id " + fruitCreated.getId() + " a été inséré !");
        Fruit fruitById  = fDao.findById(1L);

        System.out.println(fruitById.getId() + " " + fruitById.getName());

        fDao.delete(11L);

        fruitCreated.setName("Updated fruit");
        boolean updateOk = fDao.update(fruitCreated);
        if (updateOk){
            System.out.println("La fruit avec l'id " + fruitCreated.getId() + " a été modifié");
        }




        ConnectionManager.closeConnection();
    }
}
