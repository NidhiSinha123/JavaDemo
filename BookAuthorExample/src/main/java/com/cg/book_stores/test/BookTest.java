/**
 * 
 */
package com.cg.book_stores.test;

import java.util.List;

import com.cg.book_stores.dao.AuthorDao;
import com.cg.book_stores.dao.IAuthorDao;
import com.cg.book_stores.dto.Author;
import com.cg.book_stores.exception.AuthorException;

/**
 * @author admin
 *
 */
public class BookTest {

	/**
	 * @param args
	 * @throws AuthorException
	 */
	public static void main(String[] args) throws AuthorException {
		IAuthorDao authordao = new AuthorDao();
		System.out.println("Listing all authors: ");
		List<Author> authorlist = authordao.listAllAuthors();
		if (authorlist != null) {
			for (Author author2 : authorlist) {
				System.out.println(author2);
			}
		} else {
			System.out.println("Null ");
		}

	}

}
