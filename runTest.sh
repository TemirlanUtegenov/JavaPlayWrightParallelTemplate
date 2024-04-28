NOW="$(date +'%Y/%m/%d/%X')"
# shellcheck disable=SC2034
apiUiName="UI_TEST_RUN_$NOW"
./mvnw clean compile test

# shellcheck disable=SC2059
printf "$(date +'%Y/%m/%d/%X')"
