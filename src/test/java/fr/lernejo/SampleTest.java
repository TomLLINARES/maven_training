package fr.lernejo;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    private final Sample sample = new Sample();
    @Test
    void op_add() {
        int result = sample.op(Sample.Operation.ADD, 1, 1);
        assertThat(result).isEqualTo(2);
    }

    void op_fact_0(){
        int result = sample.fact(0);
        assertThat(result).isEqualTo(1);

        }
    void op_add_neg() {
        int result = sample.op(Sample.Operation.ADD, -5, -1);
        assertThat(result).isEqualTo(-6);
    }
    void op_fact_neg(){
        int result = sample.fact(-3);
        assertThat(result).isEqualTo("N should be positive");
    }
}
