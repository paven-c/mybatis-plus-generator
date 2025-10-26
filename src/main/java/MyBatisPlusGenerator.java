import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyBatisPlusGenerator {

    private static final String FANCY_AI_DEV = "jdbc:mysql://localhost:3307/aione_3d_v1";

    // 处理 all 情况
    protected static List<String> getTables(String tables) {
        return "all".equals(tables) ? Collections.emptyList() : Arrays.asList(tables.split(","));
    }

    public static void main(String[] args) {
//        FastAutoGenerator.create("jdbc:mysql://fancy.cpqmvzic9agk.us-west-2.rds.amazonaws.com:3306/fancy_ai_dev", "admin", "fancyai8888")
        FastAutoGenerator.create(FANCY_AI_DEV, "root", "123456")
//        FastAutoGenerator.create(SYS, "root", "123456")
                // 全局配置
                .globalConfig((scanner, builder) -> {
                    builder.author(scanner.apply("请输入作者名称？")).fileOverride();
                    //builder.enableSwagger();
                    builder.outputDir("/Users/paven/JAVA/code/mybatis-plus-generator/src/main/java");
                })
                // 包配置
                .packageConfig((scanner, builder) -> {
                    builder.parent(scanner.apply("请输入包名？"));
                })
                // 策略配置
                .strategyConfig((scanner, builder) -> {
                    builder.addInclude(MyBatisPlusGenerator.getTables(scanner.apply("请输入表名，多个英文逗号分隔？所有输入 all")))
                            .controllerBuilder().enableRestStyle().enableHyphenStyle().build();
                    builder.serviceBuilder()
                            .formatServiceFileName("%sService")
                            .formatServiceImplFileName("%sServiceImpl")
                            .build();
                    //entity的策略配置
                    builder.entityBuilder()
                            .enableLombok()
                            .enableTableFieldAnnotation()
                            .versionColumnName("version")
                            .logicDeleteColumnName("is_delete")
                            .columnNaming(NamingStrategy.underline_to_camel)
                            .idType(IdType.ASSIGN_ID)
                            .formatFileName("%s")
                            .build();
                })
                .execute();
    }
}
