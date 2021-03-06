package com.test.dao;

import com.test.model.Euser;
import com.test.model.EuserExample;
import java.util.List;

public interface EuserDAO {
    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table euser
     *
     * @abatorgenerated Mon Nov 02 15:38:38 CST 2015
     */
    void insert(Euser record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table euser
     *
     * @abatorgenerated Mon Nov 02 15:38:38 CST 2015
     */
    List selectByExample(EuserExample example, String orderByClause);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table euser
     *
     * @abatorgenerated Mon Nov 02 15:38:38 CST 2015
     */
    List selectByExample(EuserExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table euser
     *
     * @abatorgenerated Mon Nov 02 15:38:38 CST 2015
     */
    int deleteByExample(EuserExample example);
}