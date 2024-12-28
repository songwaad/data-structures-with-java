/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HWLinkedList;

/**
 *
 * @author LENOVO
 */
public class Player {
    int id;
    String name;
    String position;
    int rating;
    float value;
    String team;
    
    public void set(int i, String n, String p, int r, float v, String t) {
        this.id = i; this.name = n; this.position = p; this.rating = r; this.value = v; this.team = t;
    }
    public void setId(int i) { id = i; }
    public void setName(String name) { this.name = name; }
    public void setPosition(String position) { this.position = position; }
    public void setRating(int rating) { this.rating = rating; }
    public void setValue(float value) { this.value = value; }
    public void setTeam(String team) { this.team = team; }
    
    public int getId() { return id; }
    public String getName() { return name; }
    public String getPosition() { return position; }
    public int getRating() { return rating; }
    public float getValue() { return value; }
    public String getTeam() { return team; }
    
    
}