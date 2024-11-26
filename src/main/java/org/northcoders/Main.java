package org.northcoders;

import org.northcoders.dao.FakeBooksDAO;
import org.northcoders.model.Results;

public class Main {
    public static void main(String[] args) {

        Results result = FakeBooksDAO.apiResults("en_GB",20,5);
        System.out.println(result);
    }
}