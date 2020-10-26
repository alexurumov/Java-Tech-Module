package todoList.entity;

import javax.persistence.*;

@Entity
public class Task {

    private Long id;

    private String title;

    private String comments;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    private void setId(Long id) {
        this.id = id;
    }

    @Column(nullable = false)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(columnDefinition = "LONGTEXT", nullable = false)
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Task(String title, String comments) {
        this.title = title;
        this.comments = comments;
    }

    public Task() {
    }
}
