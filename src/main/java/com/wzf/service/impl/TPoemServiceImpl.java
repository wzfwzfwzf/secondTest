package com.wzf.service.impl;

import com.wzf.entity.TPoem;
import com.wzf.dao.TPoemDao;
import com.wzf.service.TPoemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TPoem)表服务实现类
 *
 * @author makejava
 * @since 2020-08-16 12:33:37
 */
@Service("tPoemService")
public class TPoemServiceImpl implements TPoemService {
    @Resource
    private TPoemDao tPoemDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TPoem queryById(String id) {
        return this.tPoemDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TPoem> queryAllByLimit(int offset, int limit) {
        return this.tPoemDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tPoem 实例对象
     * @return 实例对象
     */
    @Override
    public TPoem insert(TPoem tPoem) {
        this.tPoemDao.insert(tPoem);
        return tPoem;
    }

    /**
     * 修改数据
     *
     * @param tPoem 实例对象
     * @return 实例对象
     */
    @Override
    public TPoem update(TPoem tPoem) {
        this.tPoemDao.update(tPoem);
        return this.queryById(tPoem.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.tPoemDao.deleteById(id) > 0;
    }
}