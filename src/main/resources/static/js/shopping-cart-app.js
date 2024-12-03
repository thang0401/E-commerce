app.controller("shopping-cart-ctrl", function($scope, $http){
    /*
    * QUẢN LÝ GIỎ HÀNG
    */
    $scope.cart = {
        items: [],
        // Thêm sản phẩm vào giỏ hàng
        add(id){
            var item = this.items.find(item => item.id == id);
            if(item){
                item.qty++;
                this.saveToLocalStorage();
            }
            else{
                $http.get(`/rest/products/${id}`).then(resp => {
                    resp.data.qty = 1;
                    this.items.push(resp.data);
                    this.saveToLocalStorage();
                });
            }
        },
        
        // Xóa sản phẩm khỏi giỏ hàng
        remove(id){},
        // Xóa sạch các mặt hàng trong giỏ
        clear(){},
        // Tính thành tiền của 1 sản phẩm
        amt_of(item) {},
        // Tính tổng số lượng các mặt hàng trong giỏ
        get count(){
            return this.items
                .map(item => item.qty)
                .reduce((total, qty) => total += qty, 0);
        },
        
        // Tổng thành tiền các mặt hàng trong giỏ
        get amount(){
            return this.items
                .map(item => item.qty * item.price)
                .reduce((total, qty) => total += qty, 0);
        },
        
        // Lưu giỏ hàng vào local storage
        saveToLocalStorage() {
            var json = JSON.stringify(angular.copy(this.items));
            localStorage.setItem("cart", json);
        },
        // Đọc giỏ hàng từ local storage
        loadFromLocalStorage() {}

    }
});
