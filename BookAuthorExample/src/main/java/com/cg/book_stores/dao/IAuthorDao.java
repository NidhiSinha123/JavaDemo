package com.cg.book_stores.dao;

import java.math.BigInteger;
import java.util.List;

import com.cg.book_stores.dto.Author;
import com.cg.book_stores.exception.AuthorException;


public interface IAuthorDao {

	public Author addAuthor(Author author) throws AuthorException;
	public List<Author> listAllAuthors() throws AuthorException;
	public boolean deleteAuthor(int authorid) throws AuthorException;
	public boolean updateAuthor(int authorid,BigInteger phoneno) throws AuthorException;
}
