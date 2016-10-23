/**
 * This class is generated by jOOQ
 */
package com.justweighit.database.jooq.tables.records;


import com.justweighit.database.jooq.tables.Food;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


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
public class FoodRecord extends UpdatableRecordImpl<FoodRecord> implements Record3<String, String, String> {

    private static final long serialVersionUID = -1188299255;

    /**
     * Setter for <code>public.food.ndbno</code>.
     */
    public FoodRecord setNdbno(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.food.ndbno</code>.
     */
    public String getNdbno() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.food.description</code>.
     */
    public FoodRecord setDescription(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.food.description</code>.
     */
    public String getDescription() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.food.short_description</code>.
     */
    public FoodRecord setShortDescription(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.food.short_description</code>.
     */
    public String getShortDescription() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Food.FOOD.NDBNO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Food.FOOD.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Food.FOOD.SHORT_DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getNdbno();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getShortDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FoodRecord value1(String value) {
        setNdbno(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FoodRecord value2(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FoodRecord value3(String value) {
        setShortDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FoodRecord values(String value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FoodRecord
     */
    public FoodRecord() {
        super(Food.FOOD);
    }

    /**
     * Create a detached, initialised FoodRecord
     */
    public FoodRecord(String ndbno, String description, String shortDescription) {
        super(Food.FOOD);

        set(0, ndbno);
        set(1, description);
        set(2, shortDescription);
    }
}