package com.digitalinnovationone.heroesapi.document;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


@Data
@NoArgsConstructor
@DynamoDBTable( tableName = "Heroes_Table_Demo")
public class Heroes {
    @Id
    @DynamoDBHashKey(attributeName = "id")
    private String id;
    @DynamoDBHashKey(attributeName = "name")
    private String name;
    @DynamoDBHashKey(attributeName = "universe")
    private String universe;
    @DynamoDBHashKey(attributeName = "filas")
    private int films;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniverse() {
        return universe;
    }

    public void setUniverse(String universe) {
        this.universe = universe;
    }

    public int getFilms() {
        return films;
    }

    public void setFilms(int films) {
        this.films = films;
    }
public Heroes(String id, String name, String universe, int films) {
        this.id=id;
        this.name=name;
        this.universe=universe;
        this.films=films;

}
}
