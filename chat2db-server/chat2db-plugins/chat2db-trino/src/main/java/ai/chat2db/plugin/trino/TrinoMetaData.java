package ai.chat2db.plugin.trino;

import ai.chat2db.spi.MetaData;
import ai.chat2db.spi.jdbc.DefaultMetaService;

public class TrinoMetaData extends DefaultMetaService implements MetaData {
    public String tableDDL(String databaseName, String schemaName,String tableName) {
        return "";
    }
}
