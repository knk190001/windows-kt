import com.github.knk190001.winrtbinding.generator.generateProjection
import com.squareup.kotlinpoet.FileSpec
import io.heartpattern.gcg.api.Generator
import io.heartpattern.gcg.api.kotlin.KotlinCodeGenerator

//import
@Generator
class WinRtGenerator : KotlinCodeGenerator {
    override fun generateKotlin(): Collection<FileSpec> {
        return generateProjection()
    }
}