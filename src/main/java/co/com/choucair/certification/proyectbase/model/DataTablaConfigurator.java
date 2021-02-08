package co.com.choucair.certification.proyectbase.model;

import io.cucumber.core.api.TypeRegistry;
import io.cucumber.core.api.TypeRegistryConfigurer;
import io.cucumber.datatable.DataTableType;
import io.cucumber.datatable.TableEntryTransformer;

import java.util.Locale;
import java.util.Map;

public class DataTablaConfigurator implements TypeRegistryConfigurer {
    @Override
    public Locale locale() {
        return Locale.ENGLISH;
    }

    @Override
    public void configureTypeRegistry(TypeRegistry typeRegistry) {
        TableEntryTransformer<AcademyChoucairData> transformer = new TableEntryTransformer<AcademyChoucairData>() {
            @Override
            public AcademyChoucairData transform(Map<String, String> entry) throws Throwable {
                return new AcademyChoucairData(entry.get("strUser"),entry.get("strPassword"),entry.get("srtCourse"));
            }
        };

        DataTableType tableType = new DataTableType(AcademyChoucairData.class, transformer);
        typeRegistry.defineDataTableType(tableType);
    }
}
