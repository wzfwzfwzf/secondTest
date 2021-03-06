package com.wzf.service;

import com.wzf.entity.TPoem;
import java.util.List;

/**
 * (TPoem)表服务接口
 *
 * @author makejava
 * @since 2020-08-16 12:33:36
 */
public interface TPoemService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TPoem queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TPoem> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tPoem 实例对象
     * @return 实例对象
     */
    TPoem insert(TPoem tPoem);

    /**
     * 修改数据
     *
     * @param tPoem 实例对象
     * @return 实例对象
     */
    TPoem update(TPoem tPoem);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}