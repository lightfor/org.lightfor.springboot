package org.lightfor.springboot;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 堵着仓库类
 * Created by Light on 2017/5/15.
 */
public interface ReaderRepository extends JpaRepository<Reader, String> {
}
