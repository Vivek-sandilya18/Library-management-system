package in.library_management.status.entity;





import java.sql.Date;

import in.library_management.user.entity.Users;
import jakarta.persistence.*;

@Entity
@Table(name="Status_Table")
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;

    private Integer bookId;

    private String bookName;
    private Date issueDate;
    private Date returnDate;

    @Version         // 🔥 ADD THIS
    private Integer version;

    private String yourStatus;

    @ManyToOne
    @JoinColumn(name="user_status_id")

    private Users user;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

	public String getYourStatus() {
		return yourStatus;
	}

	public void setYourStatus(String yourStatus) {
		this.yourStatus = yourStatus;
	}

	@Override
	public String toString() {
		return "Status [bookId=" + bookId + ", bookName=" + bookName + ", issueDate=" + issueDate + ", returnDate="
				+ returnDate + ", yourStatus=" + yourStatus + ", user=" + user + "]";
	}

   
   

    
}
