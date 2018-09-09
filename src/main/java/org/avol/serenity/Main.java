package org.avol.serenity;

import org.avol.serenity.dao.impl.SampleDaoImpl;
import org.avol.serenity.service.Sample;
import org.avol.serenity.service.impl.SampleImpl;

/**
 * Created by lovababu on 09/09/18.
 */
public class Main {

    public static void main(String[] args) {
        Sample sample = new SampleImpl(new SampleDaoImpl());
        System.out.println(sample.greet("Srilekha"));;

    }
}
