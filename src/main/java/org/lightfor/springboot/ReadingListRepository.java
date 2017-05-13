package org.lightfor.springboot;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 仓库接口
 * Created by Light on 2017/5/13.
 */
public interface ReadingListRepository extends JpaRepository<Book, Long> {

    List<Book> findByReader(String reader);
}
