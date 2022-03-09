package dto;


import javax.validation.constraints.*;

public class UserDTO {
    @NotNull
    @NotEmpty(message = "Vui lòng không để trống tên")
    @NotBlank(message = "Vui lòng không nhập kí tự Khoảng Trắng")
    @Size(min = 7, message = "Vui lòng nhập tên không dưới 7 kí tự")
    private String name;

    @Min(value = 18, message = "Bạn dưới 18 tuổi, Vui lòng đợi đủ 18 tuổi")
    private int age ;

    public UserDTO(){};

    public UserDTO(String name , int age ){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
