package annotation;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import java.util.Set;

/**
 * 从整个过程来讲，首先APT检测在源代码文件中哪些annotation存在。然后APT将查找我们编写的annotation processor factories类，并且要求factories
 * 类提供处理源文件中所涉及的annotation的annotation processor。接下来，一个合适的annotation processors将被执行，如果在processors生成源
 * 代码文件时，该文件中含有annotation，则APT将重复上面的过程直到没有新文件生成。
 */
@SupportedAnnotationTypes("annotation.ClassAnnotation")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class ClassProcessor extends AbstractProcessor {

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        System.out.println("start process");
        for (TypeElement typeElement : annotations) {
            for (Element element : roundEnv.getElementsAnnotatedWith(typeElement)) {
                ClassAnnotation annotation = element.getAnnotation(ClassAnnotation.class);
                System.out.println(annotation.value());
            }
        }
        return true;
    }
}
