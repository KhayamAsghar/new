package net.simplifiedcoding.retrofitandroidtutorial.models;

public class Result {

    private int id,role;
    private String name, email, email_verified_at,created_at,updated_at;
//constructor
    public Result(int id, int role, String name, String email, String email_verified_at, String created_at, String updated_at) {
        this.id = id;
        this.role = role;
        this.name = name;
        this.email = email;
        this.email_verified_at = email_verified_at;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }
//getter
    public int getId() {
        return id;
    }

    public int getRole() {
        return role;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getEmail_verified_at() {
        return email_verified_at;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }
}
