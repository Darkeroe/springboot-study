package org.darkeroe.springboot.web.dto;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat; // junit -> assertj

public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트() {
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name,amount);

        //then
        assertThat(dto.getName()).isEqualTo(name); // assertThat 인자와 isEqualTo 인자 비교
        assertThat(dto.getAmount()).isEqualTo(amount);
    }

}
