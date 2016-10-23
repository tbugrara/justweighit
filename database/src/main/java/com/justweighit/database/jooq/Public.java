/**
 * This class is generated by jOOQ
 */
package com.justweighit.database.jooq;


import com.justweighit.database.jooq.tables.Food;
import com.justweighit.database.jooq.tables.Weight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 1314250097;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.food</code>.
     */
    public final Food FOOD = com.justweighit.database.jooq.tables.Food.FOOD;

    /**
     * The table <code>public.weight</code>.
     */
    public final Weight WEIGHT = com.justweighit.database.jooq.tables.Weight.WEIGHT;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Food.FOOD,
            Weight.WEIGHT);
    }
}