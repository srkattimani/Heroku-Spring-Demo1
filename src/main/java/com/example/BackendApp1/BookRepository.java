package com.example.BackendApp1;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BookRepository extends JpaRepository<Book, Integer> {

	 @Query("select b from Book b where b.author=:author")
	 public List<Book> getBooksByAuthorName(String author);
	
	 @Query(value = "select * from book b where b.author=:author", nativeQuery = true)
	 public List<Book> findByAuthor(String author);

	 @Query("select b from Book b where b.author = :author and b.name = :name")
	 public Book findBookByAuthorANdName(
			 @Param("author") String author,
			 @Param("name") String name);
}
