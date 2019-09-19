new Vue({
    el : "#app",
    data :{
        user :{},
    userList :[]
    },
    methods :{
        findAll :function () {

              var url ="/vue_demo/user/findAll.do";
              var _this =this;
              axios.get(url).then(function (response) {
              _this.userList=response.data;

               }).catch(function (msg) {
                  console.log(msg);
               });

        },
        findById : function (userid) {

            var url ="/vue_demo/user/findById.do";
            var _this =this;
            axios.get(url,{
                params : {
                    id : userid
                }
            }).then(function (response) {
                _this.user=response.data;

                // 模态窗口弹出
                $("#myModal").modal("show");

            }).catch(function (msg) {
                console.log(msg);
            });

        },
        update : function () {
            var url ="/vue_demo/user/update.do";
            var _this = this;
            axios.post(url,_this.user).then(function (response) {
                _this.findAll();
            }).catch(function (msg) {
                console.log(msg);
            });
        }
        },
    created(){
        this.findAll();
    }
});