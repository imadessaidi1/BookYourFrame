export UAA_CONFIG_PATH=/Users/mac/Documents/workspace/bookyourframeparent/UAA
export SPRING_PROFILES="default,hsqldb"
export JWT_TOKEN_SIGNING_KEY=$(cat $UAA_CONFIG_PATH/signingkey.pem)
export JWT_TOKEN_VERIFICATION_KEY=$(cat $UAA_CONFIG_PATH/verificationkey.pem)