package com.jk.mapper;

import com.jk.model.MessageBean;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface glMapper {

    @Select("select count(1) from t_relevant")
    String spancount();

    @Insert("insert into jk_message(name,sex,dateofbirth,maritalstatus," +
            "nationality,mailbox,cellphonenumber," +
            "contactaddress,postalcode,workingcityid,expectedcityofwork," +
            "nowengagedinindustry,presentoccupation,expectedsalary," +
            "arrivaltime,hobbiesandinterests)" +
            " values(#{name},#{sex},#{dateofbirth},#{maritalstatus}," +
            "#{nationality},#{mailbox},#{cellphonenumber}," +
            "#{contactaddress},#{postalcode},#{workingcityid}," +
            "#{expectedcityofwork},#{nowengagedinindustry}," +
            "#{presentoccupation},#{expectedsalary},#{arrivaltime},#{hobbiesandinterests})")
    void savaMessage(MessageBean messageBean);

}
