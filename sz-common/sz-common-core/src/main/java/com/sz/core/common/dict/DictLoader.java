package com.sz.core.common.dict;

import com.sz.core.common.entity.DictVO;

import java.util.List;
import java.util.Map;

/**
 * 字典加载器
 */
public interface DictLoader {

    /**
     * 加载所有字典数据，以 Map 结构返回。
     *
     * @return 字典数据的 Map，key 是 typeCode，value 是字典列表 DictVO
     */
    Map<String, List<DictVO>> loadDict();

    /**
     * 根据typeCode获取Dict
     *
     * @param typeCode
     *            类型
     * @return DictVO集合
     */
    default List<DictVO> getDict(String typeCode) {
        return loadDict().get(typeCode);
    }
}
