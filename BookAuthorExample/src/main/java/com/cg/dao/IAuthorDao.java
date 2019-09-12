package com.cg.dao;

import java.util.List;

import com.cg.dto.Author;
import com.cg.exception.AuthorException;


public interface IAuthorDao {

	public Author addAuthor(Author author) throws AuthorException;
	public List<Author> listAllAuthors() throws AuthorException;
	public boolean deleteAuthor(int authorid) throws AuthorException;
	public Author updateAuthor(Author author) throws AuthorException;
}
