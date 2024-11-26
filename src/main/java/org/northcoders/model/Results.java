package org.northcoders.model;

import java.util.ArrayList;

public record Results (
        String status,
        int code,
        String locale,
        int seed,
        int total,
        ArrayList<dataItems> data
){};

