package io.micronaut.data.tck.entities;

import io.micronaut.core.annotation.Creator;
import io.micronaut.data.annotation.*;
import io.micronaut.data.model.DataType;

import javax.annotation.Nullable;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.UUID;

@MappedEntity
public class Food {

    @Id
    @AutoPopulated
    private UUID id;

    @Size(max=36)
    @NotNull
    private String key;

    @Size(max=9999)
    @NotNull
    private int carbohydrates;

    @Size(max=9999)
    @NotNull
    private int portionGrams;

    @DateCreated
    private Date createdOn;

    @DateUpdated
    private Date updatedOn;

    @Relation(Relation.Kind.MANY_TO_ONE)
    private Meal meal;

    public Food(
            @Size(max = 36) @NotNull String key,
            @Size(max = 9999) @NotNull int carbohydrates,
            @Size(max = 9999) @NotNull int portionGrams,
            @Nullable Meal meal) {
        this.key = key;
        this.carbohydrates = carbohydrates;
        this.portionGrams = portionGrams;
        this.meal = meal;
    }

    @Creator
    public Food(
            UUID id,
            @Size(max = 36) @NotNull String key,
            @Size(max = 9999) @NotNull int carbohydrates,
            @Size(max = 9999) @NotNull int portionGrams,
            Date createdOn,
            Date updatedOn,
            @Nullable Meal meal) {
        this.id = id;
        this.key = key;
        this.carbohydrates = carbohydrates;
        this.portionGrams = portionGrams;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.meal = meal;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(int carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public int getPortionGrams() {
        return portionGrams;
    }

    public void setPortionGrams(int portionGrams) {
        this.portionGrams = portionGrams;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }
}
