import static org.hamcrest.MatcherAssert.assertThat
import static org.hamcrest.Matchers.is

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

def string = ''

Given(~/^I have a string "([^"]*)"$/) { String arg1 ->
  string = arg1
}

Then(~/^the string should be "([^"]*)"$/) { String arg1 ->
  assertThat(string, is(arg1));
}
