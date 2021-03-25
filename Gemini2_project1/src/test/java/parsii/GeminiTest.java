package parsii;

import org.junit.Test;
import parsii.eval.BinaryOperation;
import parsii.eval.Expression;
import parsii.eval.Function;
import parsii.eval.Parser;
import parsii.tokenizer.ParseException;

import java.util.List;

import static jdk.nashorn.internal.objects.Global.Infinity;
import static jdk.nashorn.internal.objects.Global.NaN;
import static org.junit.Assert.assertEquals;

public class GeminiTest {
    @Test
    public void TestSigNum() throws ParseException {
        {
            assertEquals(-1, Parser.parse("sign(-50.2)").evaluate(), BinaryOperation.EPSILON);
            assertEquals(-1, Parser.parse("sign(-99)").evaluate(), BinaryOperation.EPSILON);
            assertEquals(0, Parser.parse("sign(0.0)").evaluate(), BinaryOperation.EPSILON);
            assertEquals(0, Parser.parse("sign(0)").evaluate(), BinaryOperation.EPSILON);
            assertEquals(1, Parser.parse("sign(50.2)").evaluate(), BinaryOperation.EPSILON);
            assertEquals(1, Parser.parse("sign(60)").evaluate(), BinaryOperation.EPSILON);


        }
    }

    @Test
    public void TestInverseTrigonometry()throws ParseException {
        {
            assertEquals(-0.5551719515403636, Parser.parse("asin(rad(-30.2))").evaluate(), BinaryOperation.EPSILON);
            assertEquals(1.5707963267949, Parser.parse("acos(rad (0.0))").evaluate(), BinaryOperation.EPSILON);
            assertEquals(0.3435999727109, Parser.parse("atan(rad(20.5))").evaluate(), BinaryOperation.EPSILON);
            assertEquals(NaN, Parser.parse("asin(deg(-0.7854))").evaluate(), BinaryOperation.EPSILON);
            assertEquals(1.5707963267949, Parser.parse("acos(deg(0.0))").evaluate(), BinaryOperation.EPSILON);
            assertEquals(1.5374754087778, Parser.parse("atan(deg(0.5236))").evaluate(), BinaryOperation.EPSILON);
            assertEquals(NaN, Parser.parse("asin(deg(-50))").evaluate(), BinaryOperation.EPSILON);
            assertEquals(1.5707963267949, Parser.parse("acos(deg(0))").evaluate(), BinaryOperation.EPSILON);
            assertEquals(1.5706024013249, Parser.parse("atan(deg(90))").evaluate(), BinaryOperation.EPSILON);
            assertEquals(-0.2288860870949, Parser.parse("asin(rad(-13))").evaluate(), BinaryOperation.EPSILON);
            assertEquals(NaN, Parser.parse("acos(rad(133))").evaluate(), BinaryOperation.EPSILON);
            assertEquals(1.1944837529119, Parser.parse("atan(rad(145))").evaluate(), BinaryOperation.EPSILON);

        }


    }
    @Test
    public void TestTrigonometry() throws ParseException {
        {
            assertEquals(0, Parser.parse("sinh(deg(0.00))").evaluate(), BinaryOperation.EPSILON);
            assertEquals(1, Parser.parse("cos(rad(0))").evaluate(), BinaryOperation.EPSILON);
            assertEquals(0, Parser.parse("tan(deg(0))").evaluate(), BinaryOperation.EPSILON);
            assertEquals(-1, Parser.parse("tanh(deg(-12))").evaluate(), BinaryOperation.EPSILON);
            assertEquals(-0.9540914674728181, Parser.parse("sin(deg(90))").evaluate(), BinaryOperation.EPSILON);
        }
    }
    @Test
    public void AvgTest() throws ParseException {
        Parser.registerFunction("avg", new Function() {
            @Override
            public int getNumberOfArguments() {
                return -1;
            }

            @Override
            public double eval(List<Expression> args) {
                double avg = 0;
                if (args.isEmpty()) {
                    return avg;
                }
                for (Expression e : args) {
                    avg += e.evaluate();
                }
                return avg / args.size();
            }

            @Override
            public boolean isNaturalFunction() {
                return true;
            }
        });
        assertEquals(1.0625d, Parser.parse("avg(sin(rad(30))^3,5%3)").evaluate(), BinaryOperation.EPSILON);
        assertEquals(0, Parser.parse("avg()").evaluate(), BinaryOperation.EPSILON);
        assertEquals(0.7071067811865476, Parser.parse("avg(cos(rad(45))^1)").evaluate(), BinaryOperation.EPSILON);
        assertEquals(189.75, Parser.parse("avg(sqrt(4),5+3,4*5,9^3)").evaluate(), BinaryOperation.EPSILON);
        assertEquals(6, Parser.parse("avg(2,10)").evaluate(), BinaryOperation.EPSILON);
        assertEquals(12, Parser.parse("avg(12)").evaluate(), BinaryOperation.EPSILON);
        assertEquals(6, Parser.parse("avg(2,10)").evaluate(), BinaryOperation.EPSILON);
        assertEquals(18, Parser.parse("avg(20,20,14)").evaluate(), BinaryOperation.EPSILON);
    }

    @Test
    public void MinMaxTest() throws ParseException {
        assertEquals(3, Parser.parse("min(3,4)").evaluate(), BinaryOperation.EPSILON);
        assertEquals(1.903089987, Parser.parse("min(log(80),8)").evaluate(), BinaryOperation.EPSILON);
        assertEquals(2, Parser.parse("min(15,sqrt(4))").evaluate(), BinaryOperation.EPSILON);
        assertEquals(15, Parser.parse("max(10,15)").evaluate(), BinaryOperation.EPSILON);
        assertEquals(23, Parser.parse("max(5*3+8,1)").evaluate(), BinaryOperation.EPSILON);
        assertEquals(10, Parser.parse("max(10,2^3)").evaluate(), BinaryOperation.EPSILON);
    }

    @Test
    public void testRound() throws ParseException {
        assertEquals(-1, Parser.parse("round(-1.5)").evaluate(), BinaryOperation.EPSILON);
        assertEquals(3, Parser.parse("round(2.6)").evaluate(), BinaryOperation.EPSILON);
        assertEquals(-2, Parser.parse("floor(-1.5)").evaluate(), BinaryOperation.EPSILON);
        assertEquals(2, Parser.parse("floor(2.6)").evaluate(), BinaryOperation.EPSILON);
        assertEquals(-1, Parser.parse("ceil(-1.5)").evaluate(), BinaryOperation.EPSILON);
        assertEquals(3, Parser.parse("ceil(2.6)").evaluate(), BinaryOperation.EPSILON);
    }

    @Test
    public void testSqrt() throws ParseException {
        assertEquals(NaN, Parser.parse("sqrt(-16)").evaluate(), BinaryOperation.EPSILON);
        assertEquals(2.5298221281347035, Parser.parse("sqrt(6.4)").evaluate(), BinaryOperation.EPSILON);
    }
    @Test
    public void TestExp() throws ParseException {
        {
            assertEquals(12.182493960703473, Parser.parse("exp(2.5)").evaluate(), BinaryOperation.EPSILON);
            assertEquals(0.04076220397836621, Parser.parse("exp(-3.2)").evaluate(), BinaryOperation.EPSILON);
            assertEquals(1.0, Parser.parse("exp(0)").evaluate(), BinaryOperation.EPSILON);
            assertEquals(148.4131591025766, Parser.parse("exp(5)").evaluate(), BinaryOperation.EPSILON);
        }
    }

    @Test
    public void TestLogarithm() throws ParseException {
        {
            assertEquals(NaN, Parser.parse("log(-19.5)").evaluate(), BinaryOperation.EPSILON);
            assertEquals(4.017033339298781, Parser.parse("log(10400)").evaluate(), BinaryOperation.EPSILON);
            assertEquals(-Infinity, Parser.parse("log(0.0)").evaluate(), BinaryOperation.EPSILON);
        }
    }

    @Test
    public void TestNaturalLogarithm() throws ParseException{
        {

            assertEquals(7.921415886212478, Parser.parse("ln(2755.67)").evaluate(), BinaryOperation.EPSILON);
            assertEquals(6.0014148779611505, Parser.parse("ln(404)").evaluate(), BinaryOperation.EPSILON);
            assertEquals(NaN, Parser.parse("log(-1678.33)").evaluate(), BinaryOperation.EPSILON);
            assertEquals(-Infinity, Parser.parse("log(0.0)").evaluate(), BinaryOperation.EPSILON);
        }
    }


}