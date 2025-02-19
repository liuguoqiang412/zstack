package org.zstack.core.encrypt;

import org.zstack.core.config.GlobalConfig;
import org.zstack.core.config.GlobalConfigDef;
import org.zstack.core.config.GlobalConfigDefinition;
import org.zstack.core.config.GlobalConfigValidation;

/**
 * Created by mingjian.deng on 16/12/26.
 */
@GlobalConfigDefinition
public class EncryptGlobalConfig {
    public static final String CATEGORY = "encrypt";

    public static final String SERVICE_ID = "encrypt";

    @GlobalConfigValidation
    public static GlobalConfig ENCRYPT_ALGORITHM = new GlobalConfig(CATEGORY, "encrypt.algorithm");

    @GlobalConfigDef(defaultValue = "false", type = Boolean.class, description = "enable encrypt host " +
            "password to database")
    public static GlobalConfig ENABLE_PASSWORD_ENCRYPT = new GlobalConfig(CATEGORY, "enable.password.encrypt");

    @GlobalConfigValidation(validValues = {"default"})
    public static GlobalConfig ENCRYPT_DRIVER = new GlobalConfig(CATEGORY, "encrypt.driver");
}
