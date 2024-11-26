package org.northcoders;

import org.northcoders.dao.FakeBooksDAO;
import org.northcoders.model.Results;

public class Main {
    public static void main(String[] args) {

        Results result = FakeBooksDAO.apiResults();
        System.out.println(result);
    }
}