public class SubTask {

    private String id;
    private String title;
    private Status status;

    public SubTask(String id, String title) {
        this.id = id;
        this.title = title;
        this.status = Status.PENDING;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
