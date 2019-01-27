require 'test_helper'

class StaticPagesControllerTest < ActionDispatch::IntegrationTest
  test "should get lista" do
    get static_pages_lista_url
    assert_response :success
  end

end
