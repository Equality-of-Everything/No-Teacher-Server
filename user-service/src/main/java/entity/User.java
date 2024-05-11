package entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author : Zhang
 * @Date : Created in 2024/4/23 8:05
 * @Decription :
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @TableField("user_id")
    @TableId
    private String userId;
    private String username;;
    private String email;
    private String code;
    private String avatar;
    private String birthdate;
    // 英文水平
    private String level;
    private String sex;
}
