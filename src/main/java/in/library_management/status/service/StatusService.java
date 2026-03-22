package in.library_management.status.service;

import java.util.List;

import in.library_management.status.entity.Status;
import in.library_management.user.entity.Users;

public interface StatusService {
   // List<Status> getAllBooks();
    Status getBookById(Integer id);
    Status saveBook(Status status);
    void deleteBook(Integer id);
    
    List<Status> getBooksByUser(Integer userId);

 Users getUserById(Integer userId);
 
}